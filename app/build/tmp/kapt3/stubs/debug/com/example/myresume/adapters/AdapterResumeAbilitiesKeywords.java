package com.example.myresume.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0016\u0010\u0011\u001a\u00020\n2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/myresume/adapters/AdapterResumeAbilitiesKeywords;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/example/myresume/adapters/AdapterResumeAbilitiesKeywords$SkillKeywordViewHolder;", "skillsList", "", "", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holderKeyword", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshData", "SkillKeywordViewHolder", "app_debug"})
public final class AdapterResumeAbilitiesKeywords extends android.support.v7.widget.RecyclerView.Adapter<com.example.myresume.adapters.AdapterResumeAbilitiesKeywords.SkillKeywordViewHolder> {
    private java.util.List<java.lang.String> skillsList;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myresume.adapters.AdapterResumeAbilitiesKeywords.SkillKeywordViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myresume.adapters.AdapterResumeAbilitiesKeywords.SkillKeywordViewHolder holderKeyword, int position) {
    }
    
    public final void refreshData(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> skillsList) {
    }
    
    public AdapterResumeAbilitiesKeywords(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> skillsList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/myresume/adapters/AdapterResumeAbilitiesKeywords$SkillKeywordViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "tvSkillName", "Landroid/widget/TextView;", "setSKillName", "", "skillName", "", "app_debug"})
    public static final class SkillKeywordViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView tvSkillName = null;
        
        public final void setSKillName(@org.jetbrains.annotations.NotNull()
        java.lang.String skillName) {
        }
        
        public SkillKeywordViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}