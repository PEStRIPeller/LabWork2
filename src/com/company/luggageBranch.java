package com.company;
import java.util.Arrays;
class luggageBranch   {

    public luggageInfo[] getArray() {
        return array;
    }

    private  luggageInfo[] array;
    public void setLuggageAt(int index, luggageInfo luggage)
    {
        array[index] = luggage;
    }

    public luggageBranch(int length) {
        this.array = new luggageInfo[length];
    }
    public void resize(int newLength)
    {
        luggageInfo [] tempLuggage = new luggageInfo[newLength];
        {
            tempLuggage = Arrays.copyOf(array, newLength);
        }
        array = tempLuggage;
    }

    public luggageBranch() {

    array=new luggageInfo[0];
    }
        public double getWeightSum()
        {
            double sum = 0;
            for (com.company.luggageInfo luggageInfo : array) {
                sum += luggageInfo.getLuggageWeight();
            }
            return sum;
        }
}
