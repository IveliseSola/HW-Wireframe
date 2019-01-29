import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { OnChanges } from '@angular/core/src/metadata/lifecycle_hooks';

@Component({
  selector: 'app-project-detail-modal',
  templateUrl: './project-detail-modal.component.html',
  styleUrls: ['./project-detail-modal.component.scss']
})
export class ProjectDetailModalComponent implements OnInit, OnChanges {
  @Input() item;
  @Input() form: FormGroup;
  @Input() editable = false;
  @Output() emitCloseModal = new EventEmitter<any>();
  @Output() emitUpdateProject = new EventEmitter<any>();
  constructor() { }

  ngOnInit() {
    this.form.get('name').setValue(this.item.name);
    this.form.get('description').setValue(this.item.description);
    this.form.get('deadline').setValue(this.item.deadline);
  }

  ngOnChanges() {
    console.log(this.editable);
    this.editable ? this.form.enable() : this.form.disable();
  }

  updateProject() {
    console.log(this.form);
    this.emitUpdateProject.emit(this.form.value);
  }

}
