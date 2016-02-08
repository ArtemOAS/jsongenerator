package com.artemoas;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Chris on 2/8/16:10:29 PM.
 */
public class JsonBuilderTest {

    @Test
    public void testBuild() {
        Assert.assertEquals("{\"name\":\"value\"}", new JsonBuilder().with(
                new SimpleField("name", "value")
        ).build());
    }
    
    @Test
    public void testCheckWorkWithCollection(){
        Collection<SimpleField> fields = new ArrayList<>();
        fields.add(new SimpleField("sdsd", "wewewe"));
        Assert.assertEquals(new JsonBuilder().with(fields).build(),"{\"sdsd\":\"wewewe\"}");
    }

}