/* This file was generated by SableCC (http://www.sablecc.org/). */

package Epl.node;

import Epl.analysis.*;

public final class TTarg extends Token
{
    public TTarg()
    {
        super.setText("Target");
    }

    public TTarg(int line, int pos)
    {
        super.setText("Target");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TTarg(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTarg(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TTarg text.");
    }
}
