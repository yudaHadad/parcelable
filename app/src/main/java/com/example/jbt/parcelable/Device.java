package com.example.jbt.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jbt on 01/03/2017.
 */

public class Device  implements Parcelable
{
    String model;
    String maker;
    int size;
    int year;

    public Device(String model, String maker, int size, int year)
    {
        this.model = model;
        this.maker = maker;
        this.size = size;
        this.year = year;
    }

    protected Device(Parcel in)
    {
        model = in.readString();
        maker = in.readString();
        size = in.readInt();
        year = in.readInt();
    }

    public static final Creator<Device> CREATOR = new Creator<Device>()
    {
        @Override
        public Device createFromParcel(Parcel in)
        {
            return new Device(in);
        }

        @Override
        public Device[] newArray(int size)
        {
            return new Device[size];
        }
    };

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(model);
        parcel.writeString(maker);
        parcel.writeInt(size);
        parcel.writeInt(year);
    }
}
