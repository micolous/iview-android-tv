package io.github.xwz.sbs.fragments;

import io.github.xwz.base.content.IContentManager;
import io.github.xwz.sbs.activities.VideoPlayerActivity;
import io.github.xwz.sbs.content.ContentManager;

public class DetailsFragment extends io.github.xwz.base.fragments.DetailsFragment {

    @Override
    protected IContentManager getContentManger() {
        return ContentManager.getInstance();
    }

    @Override
    protected Class<?> getPlayerActivityClass() {
        return VideoPlayerActivity.class;
    }
}