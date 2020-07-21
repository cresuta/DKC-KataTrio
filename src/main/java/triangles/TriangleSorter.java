package triangles;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        if (sideA == sideB && sideB == sideC) {
            return "Equilateral";
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "Isosceles";
        } else if ((sideA * sideA) + (sideB * sideB) == (sideC * sideC)) {
            return "Right Triangle";
        }

        else {
            return "";
        }
    }
}
