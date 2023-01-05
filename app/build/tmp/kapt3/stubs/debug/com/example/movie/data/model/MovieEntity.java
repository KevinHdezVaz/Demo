package com.example.movie.data.model;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\fH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\fH\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\u008b\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00103\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0003H\u00d6\u0001J\t\u00106\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019\u00a8\u00067"}, d2 = {"Lcom/example/movie/data/model/MovieEntity;", "", "id", "", "backdrop_path", "", "adult", "", "original_title", "original_language", "overview", "popularity", "", "poster_path", "release_date", "title", "video", "vote_average", "vote_count", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZDI)V", "getAdult", "()Z", "getBackdrop_path", "()Ljava/lang/String;", "getId", "()I", "getOriginal_language", "getOriginal_title", "getOverview", "getPopularity", "()D", "getPoster_path", "getRelease_date", "getTitle", "getVideo", "getVote_average", "getVote_count", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class MovieEntity {
    @androidx.room.PrimaryKey()
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "backdrop_path")
    private final java.lang.String backdrop_path = null;
    @androidx.room.ColumnInfo(name = "adult")
    private final boolean adult = false;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "original_title")
    private final java.lang.String original_title = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "original_language")
    private final java.lang.String original_language = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "overview")
    private final java.lang.String overview = null;
    @androidx.room.ColumnInfo(name = "popularity")
    private final double popularity = 0.0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "poster_path")
    private final java.lang.String poster_path = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "release_date")
    private final java.lang.String release_date = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private final java.lang.String title = null;
    @androidx.room.ColumnInfo(name = "video")
    private final boolean video = false;
    @androidx.room.ColumnInfo(name = "vote_average")
    private final double vote_average = 0.0;
    @androidx.room.ColumnInfo(name = "vote_count")
    private final int vote_count = 0;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBackdrop_path() {
        return null;
    }
    
    public final boolean getAdult() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_title() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_language() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final double getPopularity() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoster_path() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRelease_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final boolean getVideo() {
        return false;
    }
    
    public final double getVote_average() {
        return 0.0;
    }
    
    public final int getVote_count() {
        return 0;
    }
    
    public MovieEntity(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String backdrop_path, boolean adult, @org.jetbrains.annotations.NotNull()
    java.lang.String original_title, @org.jetbrains.annotations.NotNull()
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, double popularity, @org.jetbrains.annotations.NotNull()
    java.lang.String poster_path, @org.jetbrains.annotations.NotNull()
    java.lang.String release_date, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean video, double vote_average, int vote_count) {
        super();
    }
    
    public MovieEntity() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie.data.model.MovieEntity copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String backdrop_path, boolean adult, @org.jetbrains.annotations.NotNull()
    java.lang.String original_title, @org.jetbrains.annotations.NotNull()
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, double popularity, @org.jetbrains.annotations.NotNull()
    java.lang.String poster_path, @org.jetbrains.annotations.NotNull()
    java.lang.String release_date, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean video, double vote_average, int vote_count) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}