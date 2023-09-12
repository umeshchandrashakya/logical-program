package org.string;

public final class ImmutableTest {
    private int i;
    public ImmutableTest(int i){
        this.i = i;
    }

    public ImmutableTest modify(int i){
        if (this.i ==i){
            return this;
        }else {
            return new ImmutableTest(i);
        }
    }

    public static void main(String[] args) {
        ImmutableTest immutableTest = new ImmutableTest(10);
        ImmutableTest immutableTest1 = immutableTest.modify(1000);
        ImmutableTest immutableTest2 = immutableTest.modify(10);
        System.out.println(immutableTest==immutableTest1);
        System.out.println(immutableTest==immutableTest2);
    }
}
