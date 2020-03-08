/* This file was generated by SableCC (http://www.sablecc.org/). */

package Epl.node;

import java.util.*;
import Epl.analysis.*;

public final class AList extends PList
{
    private PHead _head_;
    private final LinkedList _atom_ = new TypedLinkedList(new Atom_Cast());

    public AList()
    {
    }

    public AList(
        PHead _head_,
        List _atom_)
    {
        setHead(_head_);

        {
            Object temp[] = _atom_.toArray();
            for(int i = 0; i < temp.length; i++)
            {
                this._atom_.add(temp[i]);
            }
        }

    }

    public AList(
        PHead _head_,
        XPAtom _atom_)
    {
        setHead(_head_);

        if(_atom_ != null)
        {
            while(_atom_ instanceof X1PAtom)
            {
                this._atom_.addFirst(((X1PAtom) _atom_).getPAtom());
                _atom_ = ((X1PAtom) _atom_).getXPAtom();
            }
            this._atom_.addFirst(((X2PAtom) _atom_).getPAtom());
        }

    }
    public Object clone()
    {
        return new AList(
            (PHead) cloneNode(_head_),
            cloneList(_atom_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAList(this);
    }

    public PHead getHead()
    {
        return _head_;
    }

    public void setHead(PHead node)
    {
        if(_head_ != null)
        {
            _head_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _head_ = node;
    }

    public LinkedList getAtom()
    {
        return _atom_;
    }

    public void setAtom(List list)
    {
        Object temp[] = list.toArray();
        for(int i = 0; i < temp.length; i++)
        {
            _atom_.add(temp[i]);
        }
    }

    public String toString()
    {
        return ""
            + toString(_head_)
            + toString(_atom_);
    }

    void removeChild(Node child)
    {
        if(_head_ == child)
        {
            _head_ = null;
            return;
        }

        if(_atom_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_head_ == oldChild)
        {
            setHead((PHead) newChild);
            return;
        }

        for(ListIterator i = _atom_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class Atom_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PAtom node = (PAtom) o;

            if((node.parent() != null) &&
                (node.parent() != AList.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AList.this))
            {
                node.parent(AList.this);
            }

            return node;
        }
    }
}