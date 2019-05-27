package com.example.data.models.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001B-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bB\u0005\u00a2\u0006\u0002\u0010\tR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/example/data/models/cache/RealmSkills;", "Lio/realm/RealmObject;", "name", "", "level", "keywords", "Lio/realm/RealmList;", "urlImage", "(Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Ljava/lang/String;)V", "()V", "id", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getKeywords", "()Lio/realm/RealmList;", "setKeywords", "(Lio/realm/RealmList;)V", "getLevel", "setLevel", "getName", "setName", "getUrlImage", "setUrlImage", "data_debug"})
public class RealmSkills extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.PrimaryKey()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String level;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String urlImage;
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.Required()
    private io.realm.RealmList<java.lang.String> keywords;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLevel() {
        return null;
    }
    
    public final void setLevel(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrlImage() {
        return null;
    }
    
    public final void setUrlImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<java.lang.String> getKeywords() {
        return null;
    }
    
    public final void setKeywords(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> p0) {
    }
    
    public RealmSkills() {
        super();
    }
    
    public RealmSkills(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String level, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> keywords, @org.jetbrains.annotations.NotNull()
    java.lang.String urlImage) {
        super();
    }
}