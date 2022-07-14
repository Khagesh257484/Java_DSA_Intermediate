/*
Q3. Valid Sudoku
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Determine if a Sudoku is valid, according to: http://sudoku.com.au/TheRules.aspx

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.



The input corresponding to the above configuration :

["53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"]
A partially filled sudoku which is valid.

Note:

A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem

See Expected Output

* */

package com.dsa.intermediate.Hashing;

import java.util.HashSet;

public class ValidSudoku {


    /*
     if 2d matrices is given then use

     if (!seen.add("row" + i + A[i].charAt(j)) || !seen.add("col" + j + A[i][j]))

    * */

    public int isValidSudoku(final String[] A) {
        HashSet seen = new HashSet();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (A[i].charAt(j) != '.') {
                    if (!seen.add("row" + i + A[i].charAt(j)) || !seen.add("col" + j + A[i].charAt(j)))
                        return 0;

                    if (!seen.add("box" + (i / 3) * 3 + (j / 3) + A[i].charAt(i) + j))
                        return 0;

                }
            }
        }

        return 1;
    }


}
