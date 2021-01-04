package com.example.simplerec;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LazyRecView extends RecyclerView implements LazyRecyclerView {
    private List<RecyclerView.ItemDecoration> itemDecorationList;
    private RecyclerView recyclerView;


    public LazyRecView(RecyclerView recyclerView, Context context) {
        super(context);
        acceptRec(recyclerView);

    }

    public LazyRecView with(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
        return this;
    }

    private void acceptRec(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.recyclerView = this;
        } else {
            this.recyclerView = recyclerView;
        }
    }


    public LazyRecView(@NonNull Context context) {
        super(context);

        afterCreate();
    }

    public LazyRecView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        afterCreate();
    }

    public LazyRecView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        afterCreate();
    }

    private final void afterCreate() {
        if (recyclerView == null) {
            acceptRec(null);
        }
        itemDecorationList = new ArrayList<>();

    }


    @Override
    public LazyRecyclerView lazyReturn() {
        return this;
    }

    @Override
    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    public void doStuff() {
        Log.d("franchesco", "done");
    }

    @Override
    public LazyRecyclerView lazySetLayout(RecyclerView.LayoutManager layoutManager) {
        recyclerView.setLayoutManager(layoutManager);
        return this;
    }

    @Override
    public LazyRecyclerView lazyFixedSize(boolean answer) {
        recyclerView.setHasFixedSize(answer);

        return this;
    }

    @Override
    public LazyRecyclerView lazySetEmptyLinearLayout() {

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return this;
    }

    @Override
    public LazyRecyclerView lazySetAdapter(RecyclerView.Adapter adapter) {
        recyclerView.setAdapter(adapter);//
        return this;
    }

    @Override
    public LazyRecyclerView lazyAddItemDecoration(RecyclerView.ItemDecoration itemDecoration) {
        super.addItemDecoration(itemDecoration);
        itemDecorationList.add(itemDecoration);
        recyclerView.addItemDecoration(itemDecoration);
        return this;
    }

    @Override
    public LazyRecyclerView setLayoutParams(RecyclerView.LayoutParams layoutParams) {
        recyclerView.setLayoutParams(layoutParams);
        return this;
    }

    @Override
    public LazyRecyclerView clearItemDecorations() {
        itemDecorationList.forEach(this::removeItemDecoration);
        itemDecorationList.clear();

        return null;
    }

    @Override
    public LazyRecyclerView scrollToPos(int pos) {
        recyclerView.scrollToPosition(pos);
        return this;
    }

    @Override
    public LazyRecyclerView smoothScrollToPos(int pos) {
        recyclerView.smoothScrollToPosition(pos);
        return null;
    }

    @Override
    public LazyRecyclerView scrollToXY(int x, int y) {
        recyclerView.scrollTo(x, y);
        return null;
    }

    @Override
    public LazyRecyclerView scrollByXY(int x, int y) {
        recyclerView.scrollBy(x, y);
        return null;
    }

    @Override
    public LazyRecyclerView smoothScrollByXY(int x, int y) {
        recyclerView.smoothScrollBy(x, y);
        return null;
    }

    @Override
    public LazyRecyclerView lazyRemoveAdapter() {
        recyclerView.setAdapter(null);

        return this;
    }

}
