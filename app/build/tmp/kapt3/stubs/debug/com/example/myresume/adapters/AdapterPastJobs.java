package com.example.myresume.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B)\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u00020\r2\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/myresume/adapters/AdapterPastJobs;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/example/myresume/adapters/AdapterPastJobs$PreviousWorkViewHolder;", "worksList", "Ljava/util/ArrayList;", "Lcom/example/myresume/domain/models/PastJobData;", "Lkotlin/collections/ArrayList;", "resourceManager", "Lcom/example/myresume/domain/resolver/StringsResolver;", "(Ljava/util/ArrayList;Lcom/example/myresume/domain/resolver/StringsResolver;)V", "getItemCount", "", "loadData", "", "newWorksList", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PreviousWorkViewHolder", "app_debug"})
public final class AdapterPastJobs extends android.support.v7.widget.RecyclerView.Adapter<com.example.myresume.adapters.AdapterPastJobs.PreviousWorkViewHolder> {
    private java.util.ArrayList<com.example.myresume.domain.models.PastJobData> worksList;
    private final com.example.myresume.domain.resolver.StringsResolver resourceManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myresume.adapters.AdapterPastJobs.PreviousWorkViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myresume.adapters.AdapterPastJobs.PreviousWorkViewHolder holder, int position) {
    }
    
    public final void loadData(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.myresume.domain.models.PastJobData> newWorksList) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public AdapterPastJobs(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.myresume.domain.models.PastJobData> worksList, @org.jetbrains.annotations.NotNull()
    com.example.myresume.domain.resolver.StringsResolver resourceManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/myresume/adapters/AdapterPastJobs$PreviousWorkViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "tvJobPosition", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "tvName", "tvPeriod", "tvPositionSummary", "setWorkInformation", "", "pastJobInformation", "Lcom/example/myresume/domain/models/PastJobData;", "resourceManager", "Lcom/example/myresume/domain/resolver/StringsResolver;", "app_debug"})
    public static final class PreviousWorkViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView tvJobPosition = null;
        private final android.widget.TextView tvName = null;
        private final android.widget.TextView tvPeriod = null;
        private final android.widget.TextView tvPositionSummary = null;
        
        public final void setWorkInformation(@org.jetbrains.annotations.NotNull()
        com.example.myresume.domain.models.PastJobData pastJobInformation, @org.jetbrains.annotations.NotNull()
        com.example.myresume.domain.resolver.StringsResolver resourceManager) {
        }
        
        public PreviousWorkViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}