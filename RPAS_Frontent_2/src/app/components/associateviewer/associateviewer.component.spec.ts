import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AssociateviewerComponent } from './associateviewer.component';

describe('AssociateviewerComponent', () => {
  let component: AssociateviewerComponent;
  let fixture: ComponentFixture<AssociateviewerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AssociateviewerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AssociateviewerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
