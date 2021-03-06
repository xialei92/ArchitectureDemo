package com.example.looper.architecturedemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.List;

public class ResultsBean extends BaseObservable {

  public String _id;
  public String createdAt;
  public String desc;
  public String publishedAt;
  @Bindable
  public String source;
  public String type;
  public String url;
  public boolean used;
  public String who;
  public List<String> images;
}