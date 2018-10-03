import { InMemoryDbService } from 'angular-in-memory-web-api';
import { Task } from './task';

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const tasks = [
      {id: 1, name: 'Design', description: 'Try to get the main part of the app, such as classes, relatioship, dependencies, etc'},
      {id: 2, name: 'Frontend Code', description: 'read and code, so you are able to biuld your own app'},
      {id: 3, name: 'Style', description: 'Add material for Angular library'},
      {id: 4, name: 'Review Frontend', description: 'Review the app, find bugs, refine the process, ect...'},
      {id: 5, name: 'Backend Logic', description: 'use spring boot as framework for backend'},
      {id: 6, name: 'DB', description: 'Connect logic with the data'},
      {id: 7, name: 'Review Backend', description: 'Review the app, find bugs, refine the process, ect...'}
    ];
    return {tasks};
  }

  genId(tasks: Task[]): number {
    return tasks.length > 0 ? Math.max(...tasks.map(task => task.id)) + 1 : 7;
  }
}