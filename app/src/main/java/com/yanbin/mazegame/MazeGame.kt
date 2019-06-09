package com.yanbin.mazegame

class MazeGame(val maze: Maze, val player: Player, initPlayerPosition: Position) {

    var currentPlayerPosition = initPlayerPosition

    fun movePlayer(direction: Direction) {
        currentPlayerPosition = when(direction) {
            Direction.DOWN -> Position(currentPlayerPosition.x, currentPlayerPosition.y + 1)
            Direction.RIGHT -> Position(currentPlayerPosition.x + 1, currentPlayerPosition.y)
            Direction.LEFT -> {
                val x = if(currentPlayerPosition.x == 0) 0 else currentPlayerPosition.x - 1
                Position(x, currentPlayerPosition.y)
            }
            Direction.UP -> {
                val y = if(currentPlayerPosition.y == 0) 0 else currentPlayerPosition.y - 1
                Position(currentPlayerPosition.x, y)
            }
        }

    }

}
