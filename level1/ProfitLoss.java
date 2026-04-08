class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;
        double profit = sellingPrice-costPrice;
        double profitPercent = (profit / costPrice) * 100;
        System.out.println(
            "Cost Price: " + costPrice + "\n" +
            "Selling Price: " + sellingPrice + "\n" +
            "Profit: " + profit + "\n" +
            "Profit Percentage: " + profitPercent + "%"
        );
    }
}
