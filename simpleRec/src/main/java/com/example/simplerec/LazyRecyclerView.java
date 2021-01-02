package com.example.simplerec;

import androidx.recyclerview.widget.RecyclerView;

public interface LazyRecyclerView {
      LazyRecyclerView lazyReturn();

      RecyclerView getRecyclerView();

      LazyRecyclerView lazySetLayout(RecyclerView.LayoutManager layoutManager);

      LazyRecyclerView lazyFixedSize(boolean answer);

      LazyRecyclerView lazySetEmptyLinearLayout();

      LazyRecyclerView lazySetAdapter(RecyclerView.Adapter adapter);

      LazyRecyclerView lazyAddItemDecoration(RecyclerView.ItemDecoration layoutManager);

      LazyRecyclerView setLayoutParams(RecyclerView.LayoutParams layoutParams);

      LazyRecyclerView clearItemDecorations();

      LazyRecyclerView scrollToPos(int pos);

      LazyRecyclerView smoothScrollToPos(int pos);

      LazyRecyclerView scrollToXY(int x, int y);

      LazyRecyclerView scrollByXY(int x, int y);

      LazyRecyclerView smoothScrollByXY(int x, int y);

      LazyRecyclerView lazyRemoveAdapter();
}
