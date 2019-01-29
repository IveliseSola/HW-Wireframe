import { Component, OnInit, Output, Input, EventEmitter } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-add-project',
  templateUrl: './add-project.component.html',
  styleUrls: ['./add-project.component.scss']
})
export class AddProjectComponent implements OnInit {
  @Input() form: FormGroup;
  @Output() emitProject = new EventEmitter<any>();

  constructor( ) { }

  ngOnInit() {
  }

}
