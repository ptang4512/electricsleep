/**
 * Copyright (C) 2009, 2010 SC 4ViewSoft SRL
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.androsz.electricsleepbeta.achartengine.renderer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import android.graphics.Color;
import android.graphics.Paint.Align;
import android.graphics.Typeface;

/**
 * An abstract renderer to be extended by the multiple series classes.
 */
public class DefaultRenderer implements Serializable {
	/** A no color constant. */
	public static final int NO_COLOR = Color.TRANSPARENT;
	/** The default background color. */
	public static final int BACKGROUND_COLOR = NO_COLOR;
	/** A text font for regular text, like the chart labels. */
	private static final Typeface REGULAR_TEXT_FONT = Typeface.create(
			Typeface.SERIF, Typeface.NORMAL);
	private static final long serialVersionUID = 2621775532648145174L;
	/** The default color for text. */
	public static final int TEXT_COLOR = Color.LTGRAY;
	/** The antialiasing flag. */
	private boolean antialiasing = true;
	/** If the background color is applied. */
	private boolean mApplyBackgroundColor;
	/** The axes color. */
	private int mAxesColor = TEXT_COLOR;
	/** The chart background color. */
	private int mBackgroundColor;
	/** The labels color. */
	private int mLabelsColor = TEXT_COLOR;
	/** The labels text size. */
	private float mLabelsTextSize = 9;
	/** The legend height. */
	private int mLegendHeight = 0;
	/** The legend text size. */
	private float mLegendTextSize = 12;
	/** The margins size. */
	private int[] mMargins = new int[] { 10, 20, 0, 0 };
	/** The simple renderers that are included in this multiple series renderer. */
	private final List<SimpleSeriesRenderer> mRenderers = new ArrayList<SimpleSeriesRenderer>();
	/** If the axes are visible. */
	private boolean mShowAxes = true;
	/** If the grid should be displayed. */
	private boolean mShowGrid = false;
	/** If the labels are visible. */
	private boolean mShowLabels = true;
	/** If the legend is visible. */
	private boolean mShowLegend = true;
	/** The typeface name for the texts. */
	private String textTypefaceName = REGULAR_TEXT_FONT.toString();
	/** The typeface style for the texts. */
	private int textTypefaceStyle = Typeface.NORMAL;
	/** The X axis labels alignment. */
	private Align xLabelsAlign = Align.CENTER;
	/** The Y axis labels alignment. */
	private Align yLabelsAlign = Align.CENTER;

	/**
	 * Adds a simple renderer to the multiple renderer.
	 * 
	 * @param renderer
	 *            the renderer to be added
	 */
	public void addSeriesRenderer(SimpleSeriesRenderer renderer) {
		mRenderers.add(renderer);
	}

	/**
	 * Returns the axes color.
	 * 
	 * @return the axes color
	 */
	public int getAxesColor() {
		return mAxesColor;
	}

	/**
	 * Returns the background color.
	 * 
	 * @return the background color
	 */
	public int getBackgroundColor() {
		return mBackgroundColor;
	}

	/**
	 * Returns the labels color.
	 * 
	 * @return the labels color
	 */
	public int getLabelsColor() {
		return mLabelsColor;
	}

	/**
	 * Returns the labels text size.
	 * 
	 * @return the labels text size
	 */
	public float getLabelsTextSize() {
		return mLabelsTextSize;
	}

	/**
	 * Returns the legend height.
	 * 
	 * @return the legend height
	 */
	public int getLegendHeight() {
		return mLegendHeight;
	}

	/**
	 * Returns the legend text size.
	 * 
	 * @return the legend text size
	 */
	public float getLegendTextSize() {
		return mLegendTextSize;
	}

	/**
	 * Returns the margin sizes. An array containing the margins in this order:
	 * top, left, bottom, right
	 * 
	 * @return the margin sizes
	 */
	public int[] getMargins() {
		return mMargins;
	}

	/**
	 * Returns the simple renderer from the multiple renderer list.
	 * 
	 * @param index
	 *            the index in the simple renderers list
	 * @return the simple renderer at the specified index
	 */
	public SimpleSeriesRenderer getSeriesRendererAt(int index) {
		return mRenderers.get(index);
	}

	/**
	 * Returns the simple renderers count in the multiple renderer list.
	 * 
	 * @return the simple renderers count
	 */
	public int getSeriesRendererCount() {
		return mRenderers.size();
	}

	/**
	 * Returns an array of the simple renderers in the multiple renderer list.
	 * 
	 * @return the simple renderers array
	 */
	public SimpleSeriesRenderer[] getSeriesRenderers() {
		return mRenderers.toArray(new SimpleSeriesRenderer[0]);
	}

	/**
	 * Returns the text typeface name.
	 * 
	 * @return the text typeface name
	 */
	public String getTextTypefaceName() {
		return textTypefaceName;
	}

	/**
	 * Returns the text typeface style.
	 * 
	 * @return the text typeface style
	 */
	public int getTextTypefaceStyle() {
		return textTypefaceStyle;
	}

	/**
	 * Returns the X axis labels alignment.
	 * 
	 * @return X labels alignment
	 */
	public Align getXLabelsAlign() {
		return xLabelsAlign;
	}

	/**
	 * Returns the Y axis labels alignment.
	 * 
	 * @return Y labels alignment
	 */
	public Align getYLabelsAlign() {
		return yLabelsAlign;
	}

	/**
	 * Returns the antialiasing flag value.
	 * 
	 * @return the antialiasing value
	 */
	public boolean isAntialiasing() {
		return antialiasing;
	}

	/**
	 * Returns if the background color should be applied.
	 * 
	 * @return the apply flag for the background color.
	 */
	public boolean isApplyBackgroundColor() {
		return mApplyBackgroundColor;
	}

	/**
	 * Returns if the axes should be visible.
	 * 
	 * @return the visibility flag for the axes
	 */
	public boolean isShowAxes() {
		return mShowAxes;
	}

	/**
	 * Returns if the grid should be visible.
	 * 
	 * @return the visibility flag for the grid
	 */
	public boolean isShowGrid() {
		return mShowGrid;
	}

	/**
	 * Returns if the labels should be visible.
	 * 
	 * @return the visibility flag for the labels
	 */
	public boolean isShowLabels() {
		return mShowLabels;
	}

	/**
	 * Returns if the legend should be visible.
	 * 
	 * @return the visibility flag for the legend
	 */
	public boolean isShowLegend() {
		return mShowLegend;
	}

	/**
	 * Removes a simple renderer from the multiple renderer.
	 * 
	 * @param renderer
	 *            the renderer to be removed
	 */
	public void removeSeriesRenderer(SimpleSeriesRenderer renderer) {
		mRenderers.remove(renderer);
	}

	/**
	 * Sets the antialiasing value.
	 * 
	 * @param antialiasing
	 *            the antialiasing
	 */
	public void setAntialiasing(boolean antialiasing) {
		this.antialiasing = antialiasing;
	}

	/**
	 * Sets if the background color should be applied.
	 * 
	 * @param apply
	 *            the apply flag for the background color
	 */
	public void setApplyBackgroundColor(boolean apply) {
		mApplyBackgroundColor = apply;
	}

	/**
	 * Sets the axes color.
	 * 
	 * @param color
	 *            the axes color
	 */
	public void setAxesColor(int color) {
		mAxesColor = color;
	}

	/**
	 * Sets the background color.
	 * 
	 * @param color
	 *            the background color
	 */
	public void setBackgroundColor(int color) {
		mBackgroundColor = color;
	}

	/**
	 * Sets the labels color.
	 * 
	 * @param color
	 *            the labels color
	 */
	public void setLabelsColor(int color) {
		mLabelsColor = color;
	}

	/**
	 * Sets the labels text size.
	 * 
	 * @param textSize
	 *            the labels text size
	 */
	public void setLabelsTextSize(float textSize) {
		mLabelsTextSize = textSize;
	}

	/**
	 * Sets the legend height, in pixels.
	 * 
	 * @param height
	 *            the legend height
	 */
	public void setLegendHeight(int height) {
		mLegendHeight = height;
	}

	/**
	 * Sets the legend text size.
	 * 
	 * @param textSize
	 *            the legend text size
	 */
	public void setLegendTextSize(float textSize) {
		mLegendTextSize = textSize;
	}

	/**
	 * Sets the margins, in pixels.
	 * 
	 * @param margins
	 *            an array containing the margin size values, in this order:
	 *            top, left, bottom, right
	 */
	public void setMargins(int[] margins) {
		mMargins = margins;
	}

	/**
	 * Sets if the axes should be visible.
	 * 
	 * @param showAxes
	 *            the visibility flag for the axes
	 */
	public void setShowAxes(boolean showAxes) {
		mShowAxes = showAxes;
	}

	/**
	 * Sets if the grid should be visible.
	 * 
	 * @param showGrid
	 *            the visibility flag for the grid
	 */
	public void setShowGrid(boolean showGrid) {
		mShowGrid = showGrid;
	}

	/**
	 * Sets if the labels should be visible.
	 * 
	 * @param showLabels
	 *            the visibility flag for the labels
	 */
	public void setShowLabels(boolean showLabels) {
		mShowLabels = showLabels;
	}

	/**
	 * Sets if the legend should be visible.
	 * 
	 * @param showLegend
	 *            the visibility flag for the legend
	 */
	public void setShowLegend(boolean showLegend) {
		mShowLegend = showLegend;
	}

	/**
	 * Sets the text typeface name and style.
	 * 
	 * @param typefaceName
	 *            the text typeface name
	 * @param style
	 *            the text typeface style
	 */
	public void setTextTypeface(String typefaceName, int style) {
		textTypefaceName = typefaceName;
		textTypefaceStyle = style;
	}

	/**
	 * Sets the X axis labels alignment.
	 * 
	 * @param align
	 *            the X labels alignment
	 */
	public void setXLabelsAlign(Align align) {
		xLabelsAlign = align;
	}

	/**
	 * Sets the Y axis labels alignment.
	 * 
	 * @param align
	 *            the Y labels alignment
	 */
	public void setYLabelsAlign(Align align) {
		yLabelsAlign = align;
	}

}
