package pbo.week3;

public class KelasLuar {
    private int propertiLuar = 15;

    class KelasDalam {
        public int propertiDalam = 42;

        public void getLuar() {
            System.out.println(propertiLuar);
        }
    }

    public void getDalam() {
        System.out.println(new KelasDalam().propertiDalam);
    }

    static class KelasDalamStatik {
        public int propertiDalamStatik = 69;
    }
}
