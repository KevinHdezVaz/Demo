package com.example.movie.data.local;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.movie.data.model.MovieEntity;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieEntity> __insertionAdapterOfMovieEntity;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieEntity = new EntityInsertionAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `MovieEntity` (`id`,`backdrop_path`,`adult`,`original_title`,`original_language`,`overview`,`popularity`,`poster_path`,`release_date`,`title`,`video`,`vote_average`,`vote_count`,`movie_type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getBackdrop_path() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBackdrop_path());
        }
        final int _tmp;
        _tmp = value.getAdult() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getOriginal_title() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOriginal_title());
        }
        if (value.getOriginal_language() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOriginal_language());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOverview());
        }
        stmt.bindDouble(7, value.getPopularity());
        if (value.getPoster_path() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPoster_path());
        }
        if (value.getRelease_date() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getRelease_date());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getTitle());
        }
        final int _tmp_1;
        _tmp_1 = value.getVideo() ? 1 : 0;
        stmt.bindLong(11, _tmp_1);
        stmt.bindDouble(12, value.getVote_average());
        stmt.bindLong(13, value.getVote_count());
        if (value.getMovieType() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getMovieType());
        }
      }
    };
  }

  @Override
  public Object saveMovie(final MovieEntity movieEntity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieEntity.insert(movieEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getAllMovies(final Continuation<? super List<MovieEntity>> p0) {
    final String _sql = "SELECT * FROM MovieEntity ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfMovieType = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_type");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpBackdrop_path;
            _tmpBackdrop_path = _cursor.getString(_cursorIndexOfBackdropPath);
            final boolean _tmpAdult;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAdult);
            _tmpAdult = _tmp != 0;
            final String _tmpOriginal_title;
            _tmpOriginal_title = _cursor.getString(_cursorIndexOfOriginalTitle);
            final String _tmpOriginal_language;
            _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final double _tmpPopularity;
            _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            final String _tmpPoster_path;
            _tmpPoster_path = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpRelease_date;
            _tmpRelease_date = _cursor.getString(_cursorIndexOfReleaseDate);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final boolean _tmpVideo;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfVideo);
            _tmpVideo = _tmp_1 != 0;
            final double _tmpVote_average;
            _tmpVote_average = _cursor.getDouble(_cursorIndexOfVoteAverage);
            final int _tmpVote_count;
            _tmpVote_count = _cursor.getInt(_cursorIndexOfVoteCount);
            final String _tmpMovieType;
            _tmpMovieType = _cursor.getString(_cursorIndexOfMovieType);
            _item = new MovieEntity(_tmpId,_tmpBackdrop_path,_tmpAdult,_tmpOriginal_title,_tmpOriginal_language,_tmpOverview,_tmpPopularity,_tmpPoster_path,_tmpRelease_date,_tmpTitle,_tmpVideo,_tmpVote_average,_tmpVote_count,_tmpMovieType);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
