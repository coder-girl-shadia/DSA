import java.util.*;
class Solution {
    List<List<String>>result=new ArrayList<>();
    Set<Integer>cols=new HashSet<>();
    Set<Integer>diag=new HashSet<>();
    Set<Integer>anti_diag=new HashSet<>();
    public void solve(List<String>board,int row,int n)
    {
          if (row == board.size()) {
            result.add(new ArrayList<>(board));
            return;
        }

        for(int col=0;col<n;col++)
        {
        int dval=row+col;
        int aval=row-col;
        if(cols.contains(col)|| diag.contains(dval) || anti_diag.contains(aval))
        continue;
        cols.add(col); char newrow[]=board.get(row).toCharArray();//String is immutable,so convert it to char array
        newrow[col]='Q';
        diag.add(dval);
        anti_diag.add(aval);
       
        board.set(row, new String(newrow));//coverting array to string
        solve(board,row+1,n);
        cols.remove(col);
        diag.remove(dval);
        anti_diag.remove(aval);
        char newrow1[]=board.get(row).toCharArray();//String is immutable,so convert it to char array
        newrow1[col]='.';
        board.set(row, new String(newrow1));
        
        
        }

    }
    public List<List<String>> solveNQueens(int n) {
        List<String>board=new ArrayList<>();
        for(int i=0;i<n;i++)
        {

            char row[]=new char[n];
            Arrays.fill(row,'.');
            board.add(new String(row));
        }
        solve(board,0,n);
        return result;
        
    }
}