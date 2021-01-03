package com.example.simplerec;

import android.content.Context;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public interface LazyRecSettings {

    LazyRecSettings onLayoutManagerCreate(Context context);

    LazyRecSettings onSpanSizeLookup(RecyclerView.Adapter adapter);

    RecyclerView.LayoutManager getLayoutManager();

    GridLayoutManager.SpanSizeLookup getSpanSizeLookup();

    LazyRecSettings combineLayoutManagerSettings();
}
