public class Location {
    public int row;
    public int col;
    public static double maxValue;

    public Location() {
    }

    public Location(int row, int col, double maxValue) {
        this.row = row;
        this.col = col;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public static Location locateLagest(double[][] arrNumber) {
        maxValue = arrNumber[0][0];
        Location locationMaxnumber = new Location();
        for (int i = 0; i < arrNumber.length; i++) {
            for (int j = 0; j < arrNumber[i].length; j++) {
                if (arrNumber[i][j] > maxValue) ;
                maxValue = arrNumber[i][j];
                locationMaxnumber.setRow(i);
                locationMaxnumber.setCol(j);
                locationMaxnumber.setMaxValue(maxValue);
            }
        }
        return locationMaxnumber;
    }

    public String toString() {
        return "The location of the largest element is"
                + getMaxValue() +
                " (" + getRow() +
                ", " + getCol() +
                ")";
    }

}
