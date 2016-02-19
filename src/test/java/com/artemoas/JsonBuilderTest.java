package com.artemoas;

import com.artemoas.model.type.*;
import com.artemoas.model.type.utills.StringGenerationRule;
import com.artemoas.model.type.utills.TakeObject;
import com.artemoas.utils.AssertionUtils;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

/**
 * Chris on 2/8/16:10:29 PM.
 */
public class JsonBuilderTest extends TakeObject {

    @Test
    public void testBuild() {
        String json = new JsonBuilder().with(new JsonString("name", "value")).buildObject();

        AssertionUtils.assertJsonEquals("{\"name\":\"value\"}", json);
    }

    @Test
    public void testBuildWithCollectionOfFields() {
        Collection<AbstractField> fields = Lists.<AbstractField> newArrayList(new JsonString("sdsd", "wewewe"));
        String json = new JsonBuilder().with(fields).buildObject();

        AssertionUtils.assertJsonEquals("{\"sdsd\":\"wewewe\"}", json);
    }

    @Test
    public void testBuildWithTypedField() {
        String json = new JsonBuilder().with(new JsonNumber("age", "5")).buildObject();

        AssertionUtils.assertJsonEquals("{\"age\":5}", json);
    }

    @Test
    public void test() {
        String json = new JsonObject(null, Lists.newArrayList(
                new JsonString("name", "test"),
                new JsonArray("roles", Lists.newArrayList(
                        new JsonNumber(null, "1"),
                        new JsonNumber(null, "2"),
                        new JsonNumber(null, "3")
                ))
        )).print();

        AssertionUtils.assertJsonEquals("{\"name\":\"test\",\"roles\":[1,2,3]}", json);
    }

    @Test
    public void testJsonRandomString(){
        StringGenerationRule stringGenerationRule = new StringGenerationRule(10,95,122);
        System.out.println(
                new JsonBuilder().with(
                        new JsonRandomString("name", "").withRandomCharacteristics(TakeObject.newInstance())).buildObject());

        Assert.assertEquals(stringGenerationRule.generateRandomString().length(), 10);

        // TODO : FIXME
//        Assert.assertEquals(jsonRandomString.print(), jsonRandomString.print());
    }

}