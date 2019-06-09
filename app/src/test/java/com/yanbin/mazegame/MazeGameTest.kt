package com.yanbin.mazegame

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class MazeGameTest {

    @Test
    fun `player at 0, 0 and move direction is down should go to 0, 1`() {
        val maze = Maze()
        val player = Player(Direction.DOWN)
        val playerPosition = Position(0, 0)
        val game = MazeGame(maze, player, playerPosition)
        game.movePlayer(Direction.DOWN)

        assertEquals(Position(0, 1), game.currentPlayerPosition)
    }


    @Test
    fun `player at 0, 0 and move direction is right should go to 1, 0`() {
        val maze = Maze()
        val player = Player(Direction.DOWN)
        val playerPosition = Position(0, 0)
        val game = MazeGame(maze, player, playerPosition)
        game.movePlayer(Direction.RIGHT)

        assertEquals(Position(1, 0), game.currentPlayerPosition)
    }


    @Test
    fun `player at 1, 1 and move direction is left should go to 0, 1`() {
        val maze = Maze()
        val player = Player(Direction.DOWN)
        val playerPosition = Position(1, 1)
        val game = MazeGame(maze, player, playerPosition)
        game.movePlayer(Direction.LEFT)

        assertEquals(Position(0, 1), game.currentPlayerPosition)
    }


    @Test
    fun `player at 1, 1 and move direction is up should go to 1, 0`() {
        val maze = Maze()
        val player = Player(Direction.DOWN)
        val playerPosition = Position(1, 1)
        val game = MazeGame(maze, player, playerPosition)
        game.movePlayer(Direction.UP)

        assertEquals(Position(1, 0), game.currentPlayerPosition)
    }


    @Test
    fun `player at 0, 0 and move direction is up should not move`() {
        val maze = Maze()
        val player = Player(Direction.DOWN)
        val playerPosition = Position(0, 0)
        val game = MazeGame(maze, player, playerPosition)
        game.movePlayer(Direction.UP)

        assertEquals(Position(0, 0), game.currentPlayerPosition)
    }


    @Test
    fun `player at 0, 0 and move direction is left should not move`() {
        val maze = Maze()
        val player = Player(Direction.DOWN)
        val playerPosition = Position(0, 0)
        val game = MazeGame(maze, player, playerPosition)
        game.movePlayer(Direction.LEFT)

        assertEquals(Position(0, 0), game.currentPlayerPosition)
    }
}