// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 2017/10/15 11:39:05
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Person.java

package com.behaviour.Strategy.Persons;

import com.behaviour.Strategy.Behaviours.AtkBehaviour;
import java.io.PrintStream;

public class Person
{

    Person()
    {
    }

    Person(AtkBehaviour atkBehaviour)
    {
        this.atkBehaviour = atkBehaviour;
    }

    public void eat()
    {
        System.out.println("I'm eating");
    }

    public void run()
    {
        System.out.println("I'm running");
    }

    public void setAtkBehaviour(AtkBehaviour atkBehaviour)
    {
        this.atkBehaviour = atkBehaviour;
    }

    public AtkBehaviour atkBehaviour;
}
