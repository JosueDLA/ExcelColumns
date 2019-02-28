/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelcolumns;

/**
 *
 * @author Joan Diaz
 */
public class ExcelColumns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        String [] columnNames = generateExcelColumnNames(350);
        
        for(String columnName : columnNames){
            System.out.println(columnName + " ");
        }
    }
    
     public static String[] generateExcelColumnNames(int columnCount){
        String[] excelNames = null;
        
        if(columnCount >=1 && columnCount<=10000){
            excelNames = new String[columnCount];

            int A = 65, Z = 90, ABC = A, pos = 0;
            String temp = "";

            for(int i=0; i<columnCount; i++){
                //System.out.println(temp + (char)ABC);
                excelNames[i] = temp+(char)ABC;

                ABC++;

                if(ABC>Z){
                    ABC=65;
                    temp=excelNames[pos];
                    pos++;
                }
            }
        }

        return excelNames;
    }
    
}
