// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 2017/10/15 11:38:11
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   StartAction.java

package com.behaviour.Strategy;

import com.behaviour.Strategy.Behaviours.AtkBehaviour;
import com.behaviour.Strategy.Behaviours.AtkByMagic;
import com.behaviour.Strategy.Behaviours.AtkByShoot;
import com.behaviour.Strategy.Behaviours.AtkBySword;
import com.behaviour.Strategy.Persons.MagicPerson;
import com.behaviour.Strategy.Persons.Person;
import com.behaviour.Strategy.Persons.ShooterPerson;
import com.behaviour.Strategy.Persons.WarriorPerson;

public class StartAction
{

    public StartAction()
    {
    }

    public static void main(String args[])
    {
        Person warrior1 = new WarriorPerson(new AtkBySword());
        Person magic1 = new MagicPerson(new AtkByMagic());
        Person shooter1 = new ShooterPerson(new AtkByShoot());
        warrior1.atkBehaviour.atk();
        magic1.atkBehaviour.atk();
        shooter1.atkBehaviour.atk();
    }
}
