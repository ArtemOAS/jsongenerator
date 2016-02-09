package com.artemoas;

import com.artemoas.model.FieldType;
import com.artemoas.model.SimpleField;
import com.artemoas.model.TypedField;
import com.artemoas.utils.AssertionUtils;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collection;

/**
 * Chris on 2/8/16:10:29 PM.
 */
public class JsonBuilderTest {

    @Test
    public void testBuild() {
        String json = new JsonBuilder().with(new SimpleField("name", "value")).build();

        AssertionUtils.assertJsonEquals("{\"name\":\"value\"}", json);
    }

    @Test
    public void testBuildWithCollectionOfFields() {
        Collection<SimpleField> fields = Lists.newArrayList(new SimpleField("sdsd", "wewewe"));
        String json = new JsonBuilder().with(fields).build();

        AssertionUtils.assertJsonEquals("{\"sdsd\":\"wewewe\"}", json);
    }

    @Test
    public void testDataSimpleField(){
        String json = new JsonBuilder().with(SimpleField.of("firstName", "value")).build();

        AssertionUtils.assertJsonEquals("{\"firstName\":\"value\"}", json);
    }

    @Test
    public void testBuildWithTypedField() {
        String json = new JsonBuilder().withPrintable(new TypedField("age", "5", FieldType.NUMBER)).build();

        AssertionUtils.assertJsonEquals("{\"age\":5}", json);
    }

}