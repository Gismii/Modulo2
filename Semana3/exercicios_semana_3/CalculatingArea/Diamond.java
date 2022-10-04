package CalculatingArea;

public class Diamond {
    private double biggerDiagonal;
    private double miniDiagonal;
    public Diamond(double biggerDiagonal, double miniDiagonal) {
        this.biggerDiagonal = biggerDiagonal;
        this.miniDiagonal = miniDiagonal;
    }
    public double getBiggerDiagonal() {
        return biggerDiagonal;
    }
    public void setDiagonalMaior(double biggerDiagonal) {
        this.biggerDiagonal = biggerDiagonal;
    }
    public double getMiniDiagonal() {
        return miniDiagonal;
    }
    public void setMiniDiagonal(double miniDiagonal) {
        this.miniDiagonal = miniDiagonal;
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "biggerDiagonal=" + biggerDiagonal +
                ", miniDiagonal=" + miniDiagonal +
                '}';
    }

    public Double CalculatinArea(double biggerDiagonal, double miniDiagonal) {
        return biggerDiagonal * (miniDiagonal/2);
    }
}



