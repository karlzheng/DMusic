package com.d.music.component.media;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.d.music.common.Constants;
import com.d.music.component.greendao.bean.MusicModel;
import com.d.music.transfer.manager.Transfer;
import com.d.music.utils.FileUtil;

/**
 * HitTagget
 * Created by D on 2018/8/23.
 */
public class HitTarget {

    @NonNull
    public static String hitLrc(MusicModel model) {
        final String filePostfix = Transfer.PREFIX_LRC;
        String tempPath = "";
        if (TextUtils.isEmpty(tempPath) || !FileUtil.isFileExist(tempPath)) {
            tempPath = model.lrcUrl;
        }
        if (TextUtils.isEmpty(tempPath) || !FileUtil.isFileExist(tempPath)) {
            tempPath = model.fileFolder + "/" + model.songName + filePostfix;
        }
        if (TextUtils.isEmpty(tempPath) || !FileUtil.isFileExist(tempPath)) {
            tempPath = Constants.Path.lyric + model.songName + filePostfix;
        }
        if (TextUtils.isEmpty(tempPath) || !FileUtil.isFileExist(tempPath)) {
            tempPath = Constants.Path.cache + model.songName + filePostfix;
        }
        if (TextUtils.isEmpty(tempPath) || !FileUtil.isFileExist(tempPath)) {
            tempPath = "";
        }
        return tempPath;
    }

    @NonNull
    public static String hitSong(MusicModel model) {
        final String filePostfix = !TextUtils.isEmpty(model.filePostfix) ? "." + model.filePostfix
                : Transfer.PREFIX_SONG;
        String tempPath = "";
        if (TextUtils.isEmpty(tempPath) || !FileUtil.isFileExist(tempPath)) {
            tempPath = model.url;
        }
        if (TextUtils.isEmpty(tempPath) || !FileUtil.isFileExist(tempPath)) {
            tempPath = model.fileFolder + "/" + model.songName + filePostfix;
        }
        if (TextUtils.isEmpty(tempPath) || !FileUtil.isFileExist(tempPath)) {
            tempPath = Constants.Path.download + model.songName + filePostfix;
        }
        if (TextUtils.isEmpty(tempPath) || !FileUtil.isFileExist(tempPath)) {
            tempPath = Constants.Path.cache + model.songName + filePostfix;
        }
        if (TextUtils.isEmpty(tempPath) || !FileUtil.isFileExist(tempPath)) {
            tempPath = "";
        }
        return tempPath;
    }
}