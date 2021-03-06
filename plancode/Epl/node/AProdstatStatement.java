/* This file was generated by SableCC (http://www.sablecc.org/). */

package Epl.node;

import java.util.*;
import Epl.analysis.*;

public final class AProdstatStatement extends PStatement
{
    private PNonprod _nonprod_;

    public AProdstatStatement()
    {
    }

    public AProdstatStatement(
        PNonprod _nonprod_)
    {
        setNonprod(_nonprod_);

    }
    public Object clone()
    {
        return new AProdstatStatement(
            (PNonprod) cloneNode(_nonprod_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProdstatStatement(this);
    }

    public PNonprod getNonprod()
    {
        return _nonprod_;
    }

    public void setNonprod(PNonprod node)
    {
        if(_nonprod_ != null)
        {
            _nonprod_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _nonprod_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_nonprod_);
    }

    void removeChild(Node child)
    {
        if(_nonprod_ == child)
        {
            _nonprod_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_nonprod_ == oldChild)
        {
            setNonprod((PNonprod) newChild);
            return;
        }

    }
}
