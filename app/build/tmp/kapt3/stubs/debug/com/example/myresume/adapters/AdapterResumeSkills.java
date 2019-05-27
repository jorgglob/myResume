package com.example.myresume.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0016\u0010\u0013\u001a\u00020\f2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/myresume/adapters/AdapterResumeSkills;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/example/myresume/adapters/AdapterResumeSkills$SkillViewHolder;", "skillsList", "", "Lcom/example/myresume/domain/models/SkillsData;", "imageDownloader", "Lcom/example/myresume/services/ImageDownloader;", "(Ljava/util/List;Lcom/example/myresume/services/ImageDownloader;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshData", "SkillViewHolder", "app_debug"})
public final class AdapterResumeSkills extends android.support.v7.widget.RecyclerView.Adapter<com.example.myresume.adapters.AdapterResumeSkills.SkillViewHolder> {
    private java.util.List<com.example.myresume.domain.models.SkillsData> skillsList;
    private final com.example.myresume.services.ImageDownloader imageDownloader = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myresume.adapters.AdapterResumeSkills.SkillViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myresume.adapters.AdapterResumeSkills.SkillViewHolder holder, int position) {
    }
    
    public final void refreshData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.myresume.domain.models.SkillsData> skillsList) {
    }
    
    public AdapterResumeSkills(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.myresume.domain.models.SkillsData> skillsList, @org.jetbrains.annotations.NotNull()
    com.example.myresume.services.ImageDownloader imageDownloader) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/myresume/adapters/AdapterResumeSkills$SkillViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "adapterResumeAbilitiesKeywords", "Lcom/example/myresume/adapters/AdapterResumeAbilitiesKeywords;", "skillsRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "tvSkillIcon", "Landroid/widget/ImageView;", "tvSkillTitle", "Landroid/widget/TextView;", "renderSkillsInformation", "", "abilitiesInformation", "", "", "setSKillInfo", "skillData", "Lcom/example/myresume/domain/models/SkillsData;", "imageDownloader", "Lcom/example/myresume/services/ImageDownloader;", "app_debug"})
    public static final class SkillViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView tvSkillTitle = null;
        private final android.widget.ImageView tvSkillIcon = null;
        private android.support.v7.widget.RecyclerView skillsRecyclerView;
        private com.example.myresume.adapters.AdapterResumeAbilitiesKeywords adapterResumeAbilitiesKeywords;
        
        public final void setSKillInfo(@org.jetbrains.annotations.NotNull()
        com.example.myresume.domain.models.SkillsData skillData, @org.jetbrains.annotations.NotNull()
        com.example.myresume.services.ImageDownloader imageDownloader) {
        }
        
        private final void renderSkillsInformation(java.util.List<java.lang.String> abilitiesInformation) {
        }
        
        public SkillViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}