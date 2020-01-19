package com.example.moviecatalogue;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private int photo;
    private String judul;
    private String deskripsi;
    private String tglTayang;
    private String director;
    private String screenplay;
    private String rate;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTglTayang() {
        return tglTayang;
    }

    public void setTglTayang(String tglTayang) {
        this.tglTayang = tglTayang;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getScreenplay() {
        return screenplay;
    }

    public void setScreenplay(String screenplay) {
        this.screenplay = screenplay;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.photo);
        dest.writeString(this.judul);
        dest.writeString(this.deskripsi);
        dest.writeString(this.tglTayang);
        dest.writeString(this.director);
        dest.writeString(this.screenplay);
        dest.writeString(this.rate);
    }

    public Movie() {
    }

    protected Movie(Parcel in) {
        this.photo = in.readInt();
        this.judul = in.readString();
        this.deskripsi = in.readString();
        this.tglTayang = in.readString();
        this.director = in.readString();
        this.screenplay = in.readString();
        this.rate = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
