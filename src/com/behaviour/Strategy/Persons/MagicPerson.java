// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 2017/10/15 11:38:49
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   MagicPerson.java

package com.behaviour.Strategy.Persons;

import com.behaviour.Strategy.Behaviours.AtkBehaviour;

// Referenced classes of package com.behaviour.Strategy.Persons:
//            Person

public class MagicPerson extends Person
{

    public MagicPerson(AtkBehaviour atkBehaviour)
    {
        setAtkBehaviour(atkBehaviour);
    }

    public void eat()
    {
    }

    public void run()
    {
    }
}
