import java.util.Scanner;

class xo
{
    public static void main(String[] args)
    {
        xo obj = new xo();
        int n = Integer.parseInt(obj.Input("Enter Table Size: "));
        char[][] table = new char[n][n];
        boolean[][] used = new boolean[n][n];
        obj.setTableTo_(table);
        obj.printTable(table);
        for(;;){
            char xo = obj.Input("input X/O: ").charAt(0);
            if (xo == 'E')
            {
                break;
            }
            int i = Integer.parseInt(obj.Input("Index i: "));
            int j = Integer.parseInt(obj.Input("Index j: "));

            obj.isXOUsed(used, table, i, j, xo);
            obj.printTable(table);
            if(obj.getWin(table)){
                break;
            }
        }
    }

    String Input(String UI){
        Scanner In = new Scanner(System.in);
        System.out.print(UI);
        return In.next();
    }

    void setTableTo_(char[][] table){
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                table[i][j] = '-';
            }
        }
    }

    void setTableXO(char[][] table, int i, int j, char xo){
        table[i][j] = xo;
    }

    void printTable(char[][] table){
        System.out.println();
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    void isXOUsed(boolean[][] used, char[][] table, int i, int j, char xo){
        if(xo == 'X' || xo == 'O'){
            if (i < table.length && i >= 0 && j < table.length && j >= 0)
            {
                if(!used[i][j]){
                    used[i][j] = true;
                    setTableXO(table, i, j, xo);
                }
                else{
                    System.out.println("Index Already used!");
                }
            }
            else{
                System.out.println("Index Error");
            }

        }
        else{
            System.out.println("Please input X/O");
        }
    }

    boolean getWin(char[][] table){
        int rowX, colX, l_to_rX = 0, r_to_lX = 0;
        int rowO, colO, l_to_rO = 0, r_to_lO = 0;

        for(int i=0;i<table.length;i++){
            rowX = colX = 0;
            rowO = colO = 0;

            for(int j=0;j<table[i].length;j++){
                if(i == j){
                    if(table[i][j] == 'X') l_to_rX++;
                    if(table[i][j] == 'O') l_to_rO++;
                }
                if(i + j == table.length - 1){
                    if(table[i][j] == 'X') r_to_lX++;
                    if(table[i][j] == 'O') r_to_lO++;
                }
                if(table[i][j] == 'X') rowX++;
                if(table[j][i] == 'X') colX++;
                if(table[i][j] == 'O') rowO++;
                if(table[j][i] == 'O') colO++;
            }

            if (rowX == table.length || colX == table.length || l_to_rX == table.length || r_to_lX == table.length ||
                    rowO == table.length || colO == table.length || l_to_rO == table.length || r_to_lO == table.length)
            {
                return true;
            }
        }
        return false;
    }
}