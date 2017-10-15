// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 2017/10/15 11:39:38
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   AtkByMagic.java

package com.behaviour.Strategy.Behaviours;

import java.io.PrintStream;

// Referenced classes of package com.behaviour.Strategy.Behaviours:
//            AtkBehaviour

public class AtkByMagic
    implements AtkBehaviour
{

    public AtkByMagic()
    {
    }

    public void atk()
    {
        System.out.println("I'm using magic to attack.");
    }
}
