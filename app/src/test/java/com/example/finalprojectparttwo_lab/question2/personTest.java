package com.example.finalprojectparttwo_lab.question2;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class personTest{

    @Test
    public void playTest() {
        person person = new person("name", 15);

        person person1 = Mockito.spy(person);

        Mockito.doReturn(true).when(person1).runInGround("ground");

        Assert.assertEquals(true, person1.isPlay());
    }
}
