import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.scss']
})
export class ProjectListComponent implements OnInit {
  @Input() projects;
  @Output() emitShowDetails = new EventEmitter<any>();
  @Output() emitDeleteItem = new EventEmitter<any>();

  constructor() { }

  ngOnInit() {
  }

}
