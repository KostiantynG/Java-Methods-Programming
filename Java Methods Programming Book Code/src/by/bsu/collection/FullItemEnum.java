package by.bsu.collection;

/* # 10 # перечисление, предоставляющее возможность сортировки по убыванию\
возрастанию для всех полей класса # FullItemEnum.java # */

public enum FullItemEnum {
    ITEM_ID(true), PRICE(false), NAME(true);
    private boolean ascend;

    private FullItemEnum(boolean ascend) {
        this.ascend = ascend;
    }

    public boolean getAscend() {
        return ascend;
    }

    public void setAscend(boolean ascend) {
        this.ascend = ascend;
    }
}