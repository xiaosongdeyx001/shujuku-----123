namespace HotelManagementUI.Room
{
    partial class FormRoom
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FormRoom));
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.toolStripButton_add = new System.Windows.Forms.ToolStripButton();
            this.toolStripSeparator3 = new System.Windows.Forms.ToolStripSeparator();
            this.toolStripButton_delete = new System.Windows.Forms.ToolStripButton();
            this.toolStripSeparator2 = new System.Windows.Forms.ToolStripSeparator();
            this.toolStripButton_modify = new System.Windows.Forms.ToolStripButton();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.toolStripButton1 = new System.Windows.Forms.ToolStripButton();
            this.toolStripButton_showAll = new System.Windows.Forms.ToolStripButton();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.RoomID = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.RoomName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.RoomPrice = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.RoomKind = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.RoomState = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.RoomRemark = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.contextMenuStrip1 = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.deleteToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.modifyToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.refreshToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.checkinToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStrip1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.contextMenuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // toolStrip1
            // 
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripButton_add,
            this.toolStripSeparator3,
            this.toolStripButton_delete,
            this.toolStripSeparator2,
            this.toolStripButton_modify,
            this.toolStripSeparator1,
            this.toolStripButton1,
            this.toolStripButton_showAll});
            this.toolStrip1.Location = new System.Drawing.Point(0, 0);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(643, 25);
            this.toolStrip1.TabIndex = 1;
            this.toolStrip1.Text = "toolStrip1";
            // 
            // toolStripButton_add
            // 
            this.toolStripButton_add.Image = ((System.Drawing.Image)(resources.GetObject("toolStripButton_add.Image")));
            this.toolStripButton_add.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.toolStripButton_add.Name = "toolStripButton_add";
            this.toolStripButton_add.Size = new System.Drawing.Size(52, 22);
            this.toolStripButton_add.Text = "增加";
            this.toolStripButton_add.Click += new System.EventHandler(this.toolStripButton_add_Click);
            // 
            // toolStripSeparator3
            // 
            this.toolStripSeparator3.Name = "toolStripSeparator3";
            this.toolStripSeparator3.Size = new System.Drawing.Size(6, 25);
            // 
            // toolStripButton_delete
            // 
            this.toolStripButton_delete.Image = ((System.Drawing.Image)(resources.GetObject("toolStripButton_delete.Image")));
            this.toolStripButton_delete.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.toolStripButton_delete.Name = "toolStripButton_delete";
            this.toolStripButton_delete.Size = new System.Drawing.Size(52, 22);
            this.toolStripButton_delete.Text = "删除";
            this.toolStripButton_delete.Click += new System.EventHandler(this.toolStripButton_delete_Click);
            // 
            // toolStripSeparator2
            // 
            this.toolStripSeparator2.Name = "toolStripSeparator2";
            this.toolStripSeparator2.Size = new System.Drawing.Size(6, 25);
            // 
            // toolStripButton_modify
            // 
            this.toolStripButton_modify.BackColor = System.Drawing.SystemColors.Control;
            this.toolStripButton_modify.Image = ((System.Drawing.Image)(resources.GetObject("toolStripButton_modify.Image")));
            this.toolStripButton_modify.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.toolStripButton_modify.Name = "toolStripButton_modify";
            this.toolStripButton_modify.Size = new System.Drawing.Size(52, 22);
            this.toolStripButton_modify.Text = "修改";
            this.toolStripButton_modify.Click += new System.EventHandler(this.toolStripButton_modify_Click);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(6, 25);
            // 
            // toolStripButton1
            // 
            this.toolStripButton1.BackColor = System.Drawing.SystemColors.Control;
            this.toolStripButton1.Image = ((System.Drawing.Image)(resources.GetObject("toolStripButton1.Image")));
            this.toolStripButton1.ImageAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.toolStripButton1.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.toolStripButton1.Name = "toolStripButton1";
            this.toolStripButton1.Size = new System.Drawing.Size(52, 22);
            this.toolStripButton1.Text = "查找";
            this.toolStripButton1.ToolTipText = "查找";
            this.toolStripButton1.Click += new System.EventHandler(this.toolStripButton1_Click);
            // 
            // toolStripButton_showAll
            // 
            this.toolStripButton_showAll.BackColor = System.Drawing.SystemColors.Control;
            this.toolStripButton_showAll.Image = ((System.Drawing.Image)(resources.GetObject("toolStripButton_showAll.Image")));
            this.toolStripButton_showAll.ImageAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.toolStripButton_showAll.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.toolStripButton_showAll.Name = "toolStripButton_showAll";
            this.toolStripButton_showAll.Size = new System.Drawing.Size(100, 22);
            this.toolStripButton_showAll.Text = "显示全部信息";
            this.toolStripButton_showAll.ToolTipText = "显示全部信息";
            this.toolStripButton_showAll.Click += new System.EventHandler(this.toolStripButton_showAll_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.RoomID,
            this.RoomName,
            this.RoomPrice,
            this.RoomKind,
            this.RoomState,
            this.RoomRemark});
            this.dataGridView1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridView1.Location = new System.Drawing.Point(0, 25);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.ReadOnly = true;
            this.dataGridView1.RowTemplate.Height = 23;
            this.dataGridView1.Size = new System.Drawing.Size(643, 266);
            this.dataGridView1.TabIndex = 2;
            // 
            // RoomID
            // 
            this.RoomID.DataPropertyName = "Room_ID";
            this.RoomID.HeaderText = "房间号";
            this.RoomID.Name = "RoomID";
            this.RoomID.ReadOnly = true;
            this.RoomID.Visible = false;
            // 
            // RoomName
            // 
            this.RoomName.DataPropertyName = "Room_Name";
            this.RoomName.HeaderText = "房间名";
            this.RoomName.Name = "RoomName";
            this.RoomName.ReadOnly = true;
            // 
            // RoomPrice
            // 
            this.RoomPrice.DataPropertyName = "Price";
            this.RoomPrice.HeaderText = "房间价格";
            this.RoomPrice.Name = "RoomPrice";
            this.RoomPrice.ReadOnly = true;
            // 
            // RoomKind
            // 
            this.RoomKind.DataPropertyName = "KIND";
            this.RoomKind.HeaderText = "房间类型";
            this.RoomKind.Name = "RoomKind";
            this.RoomKind.ReadOnly = true;
            // 
            // RoomState
            // 
            this.RoomState.DataPropertyName = "STATE";
            this.RoomState.HeaderText = "房间状态";
            this.RoomState.Name = "RoomState";
            this.RoomState.ReadOnly = true;
            // 
            // RoomRemark
            // 
            this.RoomRemark.DataPropertyName = "REMARK";
            this.RoomRemark.HeaderText = "备注";
            this.RoomRemark.Name = "RoomRemark";
            this.RoomRemark.ReadOnly = true;
            // 
            // contextMenuStrip1
            // 
            this.contextMenuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.deleteToolStripMenuItem,
            this.modifyToolStripMenuItem,
            this.refreshToolStripMenuItem,
            this.checkinToolStripMenuItem});
            this.contextMenuStrip1.Name = "contextMenuStrip1";
            this.contextMenuStrip1.Size = new System.Drawing.Size(153, 114);
            // 
            // deleteToolStripMenuItem
            // 
            this.deleteToolStripMenuItem.Name = "deleteToolStripMenuItem";
            this.deleteToolStripMenuItem.Size = new System.Drawing.Size(152, 22);
            this.deleteToolStripMenuItem.Text = "删除";
            this.deleteToolStripMenuItem.Click += new System.EventHandler(this.deleteToolStripMenuItem_Click);
            // 
            // modifyToolStripMenuItem
            // 
            this.modifyToolStripMenuItem.Name = "modifyToolStripMenuItem";
            this.modifyToolStripMenuItem.Size = new System.Drawing.Size(152, 22);
            this.modifyToolStripMenuItem.Text = "修改";
            this.modifyToolStripMenuItem.Click += new System.EventHandler(this.modifyToolStripMenuItem_Click);
            // 
            // refreshToolStripMenuItem
            // 
            this.refreshToolStripMenuItem.Name = "refreshToolStripMenuItem";
            this.refreshToolStripMenuItem.Size = new System.Drawing.Size(152, 22);
            this.refreshToolStripMenuItem.Text = "刷新";
            this.refreshToolStripMenuItem.Click += new System.EventHandler(this.refreshToolStripMenuItem_Click);
            // 
            // checkinToolStripMenuItem
            // 
            this.checkinToolStripMenuItem.Name = "checkinToolStripMenuItem";
            this.checkinToolStripMenuItem.Size = new System.Drawing.Size(152, 22);
            this.checkinToolStripMenuItem.Text = "办理入住";
            this.checkinToolStripMenuItem.Click += new System.EventHandler(this.checkinToolStripMenuItem_Click);
            // 
            // FormRoom
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(643, 291);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.toolStrip1);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "FormRoom";
            this.Text = "住房管理";
            this.Load += new System.EventHandler(this.Form_Room_Load);
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.contextMenuStrip1.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.ToolStripButton toolStripButton_add;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator3;
        private System.Windows.Forms.ToolStripButton toolStripButton_delete;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator2;
        private System.Windows.Forms.ToolStripButton toolStripButton_modify;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripButton toolStripButton_showAll;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.ToolStripButton toolStripButton1;
        private System.Windows.Forms.DataGridViewTextBoxColumn RoomID;
        private System.Windows.Forms.DataGridViewTextBoxColumn RoomName;
        private System.Windows.Forms.DataGridViewTextBoxColumn RoomPrice;
        private System.Windows.Forms.DataGridViewTextBoxColumn RoomKind;
        private System.Windows.Forms.DataGridViewTextBoxColumn RoomState;
        private System.Windows.Forms.DataGridViewTextBoxColumn RoomRemark;
        private System.Windows.Forms.ContextMenuStrip contextMenuStrip1;
        private System.Windows.Forms.ToolStripMenuItem deleteToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem modifyToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem refreshToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem checkinToolStripMenuItem;


    }
}