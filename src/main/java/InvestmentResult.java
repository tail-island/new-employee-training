class InvestmentResult {
    public static void main(String[] args) {
        double asset = 0;

        for (int i = 0; i < 30; ++i) {
            for (int j = 0; j < 12; ++j) {
                asset = asset * 1.01 + 1;
            }
        }

        System.out.println(asset);
    }
}
