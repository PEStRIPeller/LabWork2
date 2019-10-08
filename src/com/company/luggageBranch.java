package com.company;

import java.util.Arrays;

class LuggageBranch {
private final int MAXSIZE = 1000;
    public LuggageInfo[] getArray() {
        return array;
    }

    private LuggageInfo[] array;

    public void setLuggageAt(int index, LuggageInfo luggage) {
        array[index] = luggage;
    }

    public LuggageBranch(int length) {
        this.array = new LuggageInfo[length];
    }

    public void resize(int newLength) {
        if (newLength > array.length) {
            LuggageInfo[] tempLuggage = new LuggageInfo[newLength];
            {
                tempLuggage = Arrays.copyOf(array, newLength > MAXSIZE ? MAXSIZE : newLength);
            }
            array = tempLuggage;
        }
    }

    public LuggageBranch() {
        array = new LuggageInfo[0];
    }

    public double getWeightSum() {
        double sum = 0;
        for (LuggageInfo luggageInfo : array) {
            sum += luggageInfo.getLuggageWeight();
        }
        return sum;
    }

    public LuggageInfo remove(int index)
    {
        if (index >=0 && index < this.array.length)
        {
            LuggageInfo temp = this.array[index];
            LuggageInfo[] newBranch = Arrays.copyOf(this.array, this.array.length-1);
            for (int i = index; i < this.array.length-1; i++) {
                newBranch[i] = this.array[i+1];
            }
            this.array = newBranch;

            return temp;
        }

        return null;
    }

    @Override
    public String toString() {
        return "LuggageBranch{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
