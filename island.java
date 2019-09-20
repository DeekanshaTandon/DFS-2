//Space Complexity :(M*N)
//Time Complexity :O(M*N)
class Solution {
    public int numIslands(char[][] grid) {
        //base case
        if(grid.length == 0 || grid == null)
            return 0;

        //variable counting the number of islands
        int numcount=0;
        //traversing through the grid using two for loops
        for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                //if we encounter 1 we will call our helper function for dfs
                if(grid[i][j] == '1')
                    numcount+=dfs(grid,i,j);
            }
        }

        return numcount;

    }

    //helper function
    public int dfs(char[][] grid,int i ,int j){
        //considering all the boundary conditions of the directions or if the elemnt is a zero.
        if(i<0 || j<0 || i>grid.length || j>grid[0].length || grid[i][j] =='0' )
            return 0;

        grid[i][j]=0;
        //four recursive calls for 4 directions (up,down,right,left)
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);


        return 1;
        //to count the original island we have encountered.

    }
}