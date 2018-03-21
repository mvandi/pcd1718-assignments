package pcd.ass01.domain;

import static pcd.ass01.domain.impl.BoardFactoryImpl.defaultInstance;

public interface Board {

    static Board board(final int width, final int height) {
        return defaultInstance().createBoard(width, height);
    }

    static Board board(final Cell[][] cells) {
        return defaultInstance().createBoard(cells);
    }

    static Board immutableBoard(final Board board) {
        return defaultInstance().createImmutableBoard(board);
    }

    static Board immutableBoard(final Cell[][] cells) {
        return defaultInstance().createImmutableBoard(cells);
    }

    int getHeight();

    int getWidth();

    Cell getCell(int x, int y);

    void setCell(int x, int y, Cell cell);

}