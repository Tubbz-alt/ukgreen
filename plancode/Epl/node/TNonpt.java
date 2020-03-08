/* This file was generated by SableCC (http://www.sablecc.org/). */

package Epl.node;

import Epl.analysis.*;

public final class TNonpt extends Token
{
    public TNonpt()
    {
        super.setText("Nonproduced");
    }

    public TNonpt(int line, int pos)
    {
        super.setText("Nonproduced");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TNonpt(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNonpt(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TNonpt text.");
    }
}