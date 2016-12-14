package com.example.enclaveit.puzzleintent.lib;

/**
 * Created by enclaveit on 14/12/2016.
 */

public interface IntefacePriority {
    /**
     * We need specify priority operator
     * => read more notice directory[Priority Operator.png]
     * For example:
     * if(c == '+' || c == '-'){
     *     return 1;
     * }else if(c == '*' || c == '/'){
     *     return 2;
     * }
     */
    public abstract int priority(char c);
}
