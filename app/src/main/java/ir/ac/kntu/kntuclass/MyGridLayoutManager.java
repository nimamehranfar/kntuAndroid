package ir.ac.kntu.kntuclass;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.util.AttributeSet;

class MyGridLayoutManager extends GridLayoutManager {
  public MyGridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  public MyGridLayoutManager(Context context, int spanCount) {
    super(context, spanCount);
  }

  public MyGridLayoutManager(Context context, int spanCount, int orientation, boolean reverseLayout) {
    super(context, spanCount, orientation, reverseLayout);
  }
}
