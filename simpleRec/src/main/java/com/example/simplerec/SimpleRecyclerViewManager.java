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

public class SimpleRecyclerViewManager {

    private SimpleRecyclerViewManager() {
        //private constructor
    }

    public static LazyRecyclerView newLazyInstanceRecyclerView(Context context) {
        return new MyLazyRecyclerViewManager(context);
    }

    public static LazyRecyclerView newLazyInstanceRecyclerView(Context context, @Nullable AttributeSet attrs) {
        return new MyLazyRecyclerViewManager(context, attrs);
    }

    public static LazyRecyclerView newLazyInstanceRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        return new MyLazyRecyclerViewManager(context, attrs);
    }

    private static class MyLazyRecyclerViewManager extends RecyclerView implements LazyRecyclerView {

        private List<ItemDecoration> itemDecorationList;


        public MyLazyRecyclerViewManager(@NonNull Context context) {
            super(context);

            afterCreate();
        }

        public MyLazyRecyclerViewManager(@NonNull Context context, @Nullable AttributeSet attrs) {
            super(context, attrs);
            afterCreate();
        }

        public MyLazyRecyclerViewManager(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            afterCreate();
        }

        private final void afterCreate() {
            itemDecorationList = new ArrayList<>();

        }


        @Override
        public LazyRecyclerView lazyReturn() {
            return this;
        }

        @Override
        public RecyclerView getRecyclerView() {
            return this;
        }

        public void doStuff() {
            Log.d("franchesco", "done");
        }

        @Override
        public LazyRecyclerView lazySetLayout(LayoutManager layoutManager) {
            setLayoutManager(layoutManager);
            return this;
        }

        @Override
        public LazyRecyclerView lazyFixedSize(boolean answer) {
            setHasFixedSize(answer);

            return this;
        }

        @Override
        public LazyRecyclerView lazySetEmptyLinearLayout() {

            setLayoutManager(new LinearLayoutManager(getContext()));
            return this;
        }

        @Override
        public LazyRecyclerView lazySetAdapter(Adapter adapter) {
            setAdapter(adapter);//
            return this;
        }

        @Override
        public LazyRecyclerView lazyAddItemDecoration(ItemDecoration itemDecoration) {
            super.addItemDecoration(itemDecoration);
            itemDecorationList.add(itemDecoration);
            return this;
        }

        @Override
        public LazyRecyclerView setLayoutParams(LayoutParams layoutParams) {
            setLayoutParams(layoutParams);
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
            scrollToPosition(pos);
            return this;
        }

        @Override
        public LazyRecyclerView smoothScrollToPos(int pos) {
            super.smoothScrollToPosition(pos);
            return null;
        }

        @Override
        public LazyRecyclerView scrollToXY(int x, int y) {
            scrollTo(x, y);
            return null;
        }

        @Override
        public LazyRecyclerView scrollByXY(int x, int y) {
            scrollBy(x, y);
            return null;
        }

        @Override
        public LazyRecyclerView smoothScrollByXY(int x, int y) {
            smoothScrollBy(x, y);
            return null;
        }

        @Override
        public LazyRecyclerView lazyRemoveAdapter() {
            setAdapter(null);
            return this;
        }
    }
}
