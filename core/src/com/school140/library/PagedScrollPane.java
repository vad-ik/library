package com.school140.library;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Cell;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Array;


public class PagedScrollPane extends ScrollPane {
    private boolean wasPanDragFling = false;


    private float pageSpacing;


    private Table content;


    public PagedScrollPane() {

        super(null);

        setup();

    }


    public PagedScrollPane(Skin skin) {

        super(null, skin);

        setup();

    }


    public PagedScrollPane(Skin skin, String styleName) {

        super(null, skin, styleName);

        setup();

    }


    public PagedScrollPane(Actor widget, ScrollPaneStyle style) {

        super(null, style);

        setup();

    }


    private void setup() {

        content = new Table();

        content.defaults().space(50);

        super.setWidget(content);

    }


    public void addPages(Actor... pages) {

        for (Actor page : pages) {

            content.add(page).expandX().fillX();

        }

    }


    public void addPage(Actor page) {

        content.add(page).expandX().fillX();

    }


    @Override

    public void act(float delta) {

        super.act(delta);

        if (wasPanDragFling && !isPanning() && !isDragging() && !isFlinging()) {

            wasPanDragFling = false;

            scrollToPage();

        } else {

            if (isPanning() || isDragging() || isFlinging()) {

                wasPanDragFling = true;

            }

        }

    }

    @Override

    public void setWidget(Actor widget) {

        throw new UnsupportedOperationException("Use PagedScrollPane#addPage.");

    }


    @Override

    public void setHeight(float height) {

        super.setHeight(height);

        if (content != null) {

            for (Cell cell : content.getCells()) {

                cell.height(height);

            }

            content.invalidate();

        }

    }

    public void setPageSpacing(float pageSpacing) {

        if (content != null) {

            content.defaults().space(pageSpacing);

            for (Cell cell : content.getCells()) {

                cell.space(pageSpacing);

            }

            content.invalidate();

        }

    }


    private void scrollToPage() {

        final float height = getHeight();

        final float scrollY = getScrollY();

        final float maxY = getMaxY();

        if (scrollY >= maxY || scrollY <= 0) return;

        Array<Actor> pages = content.getChildren();

        float pageY = 0;

        float pageHeight = 0;

        if (pages.size > 0) {

            for (Actor a : pages) {

                pageY = a.getY();

                pageHeight = a.getHeight();

                if (scrollY < (pageY + pageHeight * 0.5)) {

                    break;

                }

            }

            setScrollX(MathUtils.clamp(pageY - (height - pageHeight) / 2, 0, maxY));

        }

    }


}
