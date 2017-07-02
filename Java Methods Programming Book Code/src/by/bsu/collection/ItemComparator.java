package by.bsu.collection;

/* # 9 # возможность сортировки по всем полям класса # ItemComparator.java */

import java.util.Comparator;
public class ItemComparator implements Comparator<Item> {
    private ItemEnum sortingIndex;
    public ItemComparator(ItemEnum sortingIndex) {
        setSortingIndex(sortingIndex);
    }
    public final void setSortingIndex(ItemEnum sortingIndex) {
        if (sortingIndex == null) {
            throw new IllegalArgumentException();
        }
        this.sortingIndex = sortingIndex;
    }
    public ItemEnum getSortingIndex() {
        return sortingIndex;
    }
    @Override
    public int compare(Item one, Item two) {
        switch (sortingIndex) {
            case ITEM_ID:
                return one.getItemId() - two.getItemId();
            case PRICE:
                return Double.compare(two.getPrice(),one.getPrice());
            case NAME:
                return one.getName().compareTo(two.getName());
            default:
                throw new EnumConstantNotPresentException(ItemEnum.class,sortingIndex.name());
        }
    }
}